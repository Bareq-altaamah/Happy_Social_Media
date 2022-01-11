package com.thechance.happysocialmedia.ui.createPost

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.fragment.app.viewModels
import com.thechance.happysocialmedia.R
import com.thechance.happysocialmedia.databinding.FragmentCreatePostBinding
import com.thechance.happysocialmedia.ui.base.BaseFragment
import com.thechance.happysocialmedia.util.extensions.observeEvent
import dagger.hilt.android.AndroidEntryPoint
import android.provider.MediaStore
import android.graphics.Bitmap
import android.graphics.ImageDecoder
import android.net.Uri
import android.os.Build
import android.widget.Toast

@AndroidEntryPoint
class CreatePostFragment: BaseFragment<FragmentCreatePostBinding>() {

    override fun getLayoutID() = R.layout.fragment_create_post
    override val viewModel: CreatePostViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        observeEvent()
    }

    private fun observeEvent() {
        with(viewModel) {

            clickUploadImageEvent.observeEvent(this@CreatePostFragment) {
                chooseImageFromGallery()
            }

            isSad.observe(this@CreatePostFragment){ isSad->
                if(isSad){
                    Toast
                        .makeText(
                            requireContext(),
                            " \uD83D\uDE42 \uD83D\uDE42 \uD83D\uDE42 ",
                            Toast.LENGTH_SHORT
                        ).show()
                }
            }

        }
    }

    private fun chooseImageFromGallery() {
        Intent(Intent.ACTION_PICK).apply {
            type = "image/*"
            resultLauncher.launch(this)
        }
    }

    private val resultLauncher: ActivityResultLauncher<Intent> =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == Activity.RESULT_OK) {
                result.data?.data?.let {
                    viewModel.imagePost.postValue(getBitmapFromURI(it))
                }
            }else{
                Toast.makeText(requireContext(),"fail to upload Image",Toast.LENGTH_SHORT).show()
            }
        }

    private fun getBitmapFromURI(uri: Uri): Bitmap =
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            val source = ImageDecoder.createSource(requireActivity().contentResolver, uri)
            ImageDecoder.decodeBitmap(source)
        } else {
            MediaStore.Images.Media
                .getBitmap(requireActivity().contentResolver,uri)
        }


}