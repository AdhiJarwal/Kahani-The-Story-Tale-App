package com.example.kahani.Models;

public class SpecificStoriesModel
{

    public String storytitle;
    public int display;
    public String storyDes;
    public String videoUrl;

    public SpecificStoriesModel(String storytitle, int display, String storyDes, String videoUrl) {
        this.storytitle = storytitle;
        this.display = display;
        this.storyDes = storyDes;
        this.videoUrl = videoUrl;
    }

    public String getStorytitle() {
        return storytitle;
    }

    public void setStorytitle(String storytitle) {
        this.storytitle = storytitle;
    }

    public int getDisplay() {
        return display;
    }

    public void setDisplay(int display) {
        this.display = display;
    }

    public String getStoryDes() {
        return storyDes;
    }

    public void setStoryDes(String storyDes) {
        this.storyDes = storyDes;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }
}
