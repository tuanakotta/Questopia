package org.qp.android.model.service;

import android.content.Context;
import android.net.Uri;
import android.widget.VideoView;

public class VideoPlayer {

    private VideoView videoView;

    public VideoPlayer(Context context, VideoView videoView) {
        this.videoView = videoView;
    }

    public void playVideo(String filePath) {
        Uri uri = Uri.parse(filePath);
        videoView.setVideoURI(uri);
        videoView.start();
    }

    public void stopVideo() {
        if (videoView.isPlaying()) {
            videoView.stopPlayback();
        }
    }
}
