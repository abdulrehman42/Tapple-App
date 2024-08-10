package com.example.tapple

import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.MediaController
import android.widget.VideoView
import androidx.fragment.app.Fragment
import com.example.tapple.databinding.FragmentBizTokBinding


class BizTok : Fragment() {
    lateinit var binding: FragmentBizTokBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentBizTokBinding.inflate(layoutInflater)
        video_play()
        return binding.root
    }

    private fun video_play() {
       /* val mediacontroller = MediaController(context)
        val videoView: VideoView = binding.videoPlay
        videoView.setVideoPath("android.resource://" + context?.packageName + "/" + R.raw.taply_vid)
        binding.videoPlay.setVideoURI(Uri.parse(videoView.toString()))
        binding.videoPlay.setMediaController(mediacontroller)
        binding.videoPlay.setZOrderOnTop(true)
        binding.videoPlay.requestFocus()
        binding.videoPlay.start()*/
        val videoView: VideoView = binding.videoPlay
        videoView.setVideoPath("android.resource://" + requireActivity().packageName + "/" + R.raw.taply_vid)
        videoView.start()
        videoView.setOnCompletionListener {
            videoView.start()
        }
    }


}