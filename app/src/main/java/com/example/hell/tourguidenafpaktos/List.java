package com.example.hell.tourguidenafpaktos;

public class List {

    //Default details
    private int mDetailName;

    //More Information about the tab
    private int mMoreInfo;

    // Image resource ID
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    // Constant value that represents no image was provided for this word
    private static final int NO_IMAGE_PROVIDED = 0;

    public List(int detailName, int moreInfo, int imageResourceId) {
        mDetailName = detailName;
        mMoreInfo = moreInfo;
        mImageResourceId = imageResourceId;
    }
    // Get the details
    public int getDetailName() {
        return mDetailName;
    }
    // Get more info of the tab
    public int getMoreInfo() {
        return mMoreInfo;
    }
    // Create a new object
    public int getImageResourceId() { return mImageResourceId; }

    // Returns whether or not there is an image for this word.
    public boolean hasImage() { return mImageResourceId != NO_IMAGE_PROVIDED; }
}
