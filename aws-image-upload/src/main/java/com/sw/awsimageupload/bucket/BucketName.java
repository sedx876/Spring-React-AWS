package com.sw.awsimageupload.bucket;

public enum BucketName {
    PROFILE_IMAGE("sw-image-upload-321");
    private final String bucketName;

    BucketName(String bucketName){
        this.bucketName = bucketName;
    }

    public String getBucketName(){
        return bucketName;
    }
}
