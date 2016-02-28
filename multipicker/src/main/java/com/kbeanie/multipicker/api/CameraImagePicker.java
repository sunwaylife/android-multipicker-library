package com.kbeanie.multipicker.api;

import android.app.Activity;
import android.support.v4.app.Fragment;

import com.kbeanie.multipicker.api.exceptions.PickerException;

/**
 * Created by kbibek on 2/27/16.
 */
public final class CameraImagePicker extends ImagePickerImpl {
    public CameraImagePicker(Activity activity) {
        super(activity, Picker.PICK_IMAGE_CAMERA);
    }

    public CameraImagePicker(Fragment fragment) {
        super(fragment, Picker.PICK_IMAGE_CAMERA);
    }

    public CameraImagePicker(android.app.Fragment appFragment) {
        super(appFragment, Picker.PICK_IMAGE_CAMERA);
    }

    public CameraImagePicker(Activity activity, String path) {
        super(activity, Picker.PICK_IMAGE_DEVICE);
        reinitialize(path);
    }

    public CameraImagePicker(Fragment fragment, String path) {
        super(fragment, Picker.PICK_IMAGE_DEVICE);
        reinitialize(path);
    }

    public CameraImagePicker(android.app.Fragment appFragment, String path) {
        super(appFragment, Picker.PICK_IMAGE_DEVICE);
        reinitialize(path);
    }

    public String pickImage() {
        String path = null;
        try {
            path = pick();
        } catch (PickerException e) {
            e.printStackTrace();
        }
        return path;
    }
}
