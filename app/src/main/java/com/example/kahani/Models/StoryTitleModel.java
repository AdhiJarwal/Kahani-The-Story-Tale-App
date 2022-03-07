package com.example.kahani.Models;

public class StoryTitleModel {

    public int pic;
    public String storyCategory;

    public StoryTitleModel()
    {
    }

    public StoryTitleModel(int pic, String storyCategory)
    {
        this.pic = pic;
        this.storyCategory = storyCategory;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public String getStoryCategory() {
        return storyCategory;
    }

    public void setStoryCategory(String storyCategory) {
        this.storyCategory = storyCategory;
    }
}
