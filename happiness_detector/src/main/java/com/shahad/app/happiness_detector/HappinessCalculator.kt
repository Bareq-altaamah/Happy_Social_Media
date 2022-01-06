package com.shahad.app.happiness_detector

import android.graphics.Bitmap

class HappinessCalculator: IHappinessCalculator {

    override fun analyseImageHappiness(bitmap: Bitmap, onResult: (HappinessLevel)-> Unit){
          ImageAnalyser().detectImage(
              bitmap,
              {
                  it.map { imageLabel ->
                      imageLabel.text.lowercase()
                  }.run {
                      onResult(getLevel(this))
                  }
              },
              {
                  throw Exception("Fail: ${it.message}")
              }
          )
      }

    override fun analyseTextHappiness(text: String, onResult: (HappinessLevel) -> Unit) {
        text.lowercase()
            .split(" ").apply {
            forEach { it.trim() }
            onResult(getLevel(this))
        }
    }

    private fun getLevel(labels:List<String>): HappinessLevel =
        when(getHappinessAverage(labels)) {
            in MINIMUM_SADNESS..MAXIMUM_SADNESS ->  HappinessLevel.SAD
            in MINIMUM_HAPPINESS..MAXIMUM_HAPPINESS -> HappinessLevel.HAPPY
            else -> HappinessLevel.NORMAL
        }


    private fun getHappinessAverage(labels: List<String>): Double {
        val numberOfHappinessLabel= getNumberOfLabelsInList(labels, happyLabels)
        val numberOfSadnessLabel= getNumberOfLabelsInList(labels, sadLabels)

        return( numberOfHappinessLabel/(numberOfHappinessLabel+numberOfSadnessLabel).toDouble())
    }

    private fun getNumberOfLabelsInList(labels: List<String>, storedLabels: List<String>): Int =
        labels.mapNotNull { label ->
            storedLabels.find { it == label }
        }.size

    fun addHappyLabel(vararg labels: String): HappinessCalculator {
        happyLabels.addAll(labels)
        return this
    }

    fun addSadLabels(vararg labels: String): HappinessCalculator {
        sadLabels.addAll(labels)
        return this
    }

    fun setHappyLabel(labels: MutableList<String>): HappinessCalculator {
        happyLabels = labels
        return this
    }

    fun setSadLabels(labels: MutableList<String>): HappinessCalculator {
        sadLabels = labels
        return this
    }

    companion object{
        private var happyLabels = mutableListOf("comics","toy","bird","circus","smile","laugh","balloon","picnic","clown","christmas","dance","santa claus","thanksgiving","vacation","love","money","shikoku","pet","pizza","lipstick","cool","duck","turtle","dog","rainbow","flower","airplane","butterfly","marathon","cake","fireworks","baby","bride","joker","selfie","dress","fun","leisure","river","blessed","parturition","birth","occasion","joyous","lighthearted","celebration","carnival","party","happy")
        private var sadLabels = mutableListOf("bullfighting","junk","shipwreck","caving","jungle","fire","cairn terrier","forest","militia","volcano","rocket","bangs","lightning","army","storm","helmet","funeral","sad","awful","burial","dead","depressing","farewell","misery","depression","pain","upset","torture","battle","combat","blood","fire","flood","hospital","weapon","gun","monster","fear","horror","accident","cry","tears","dark")
        private const val MINIMUM_SADNESS = 0.0
        private const val MAXIMUM_SADNESS = 0.49
        private const val MINIMUM_HAPPINESS = 0.6
        private const val MAXIMUM_HAPPINESS = 1.0
    }

}