package com.shahad.app.happiness_detector

import java.lang.Exception
import android.graphics.Bitmap
import com.google.mlkit.vision.common.InputImage
import com.google.mlkit.vision.label.ImageLabel
import com.google.mlkit.vision.label.ImageLabeling
import com.google.mlkit.vision.label.defaults.ImageLabelerOptions

internal class ImageAnalyser{

    private fun getImage(bitmap: Bitmap) =
        InputImage.fromBitmap(bitmap, ROTATION_DEGREE)

    private val labeler = ImageLabeling.getClient(ImageLabelerOptions.DEFAULT_OPTIONS)

    fun detectImage(
        bitmap: Bitmap,
        onSuccess: (List<ImageLabel>) -> Unit,
        onFail: (Exception) -> Unit
    ) {
        labeler.process(getImage(bitmap))
            .addOnSuccessListener(onSuccess)
            .addOnFailureListener(onFail)
    }

    companion object{
        const val ROTATION_DEGREE = 0
    }

}

