package com.innovationredefined.bottomnavigationtest3;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ThirdFragment extends Fragment {
    View thirdFragmentRootView;


    public ThirdFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        thirdFragmentRootView = inflater.inflate(R.layout.fragment_first, container, false);
        TextView textView = thirdFragmentRootView.findViewById(R.id.textview);
        textView.setText("A camera is an optical instrument for recording or capturing images, which may be stored locally, transmitted to another location, or both. The images may be individual still photographs or sequences of images constituting videos or movies. The camera is a remote sensing device as it senses subjects without any contact . The word camera comes from camera obscura, which means \"dark chamber\" and is the Latin name of the original device for projecting an image of external reality onto a flat surface. The modern photographic camera evolved from the camera obscura. The functioning of the camera is very similar to the functioning of the human eye. The first permanent photograph was made in 1826 by Joseph Nicéphore Niépce.\nA camera works with the light of the visible spectrum or with other portions of the electromagnetic spectrum.[1] A still camera is an optical device which creates a single image of an object or scene and records it on an electronic sensor or photographic film. All cameras use the same basic design: light enters an enclosed box through a converging lens/convex lens and an image is recorded on a light-sensitive medium(mainly a transition metal-halide). A shutter mechanism controls the length of time that light can enter the camera.[2] Most photographic cameras have functions that allow a person to view the scene to be recorded, allow for a desired part of the scene to be in focus, and to control the exposure so that it is not too bright or too dim.[3] A display, often a liquid crystal display (LCD), permits the user to view the scene to be recorded and settings such as ISO speed, exposure, and shutter speed.[4][5]\n" +
                "\n" +
                "A movie camera or a video camera operates similarly to a still camera, except it records a series of static images in rapid succession, commonly at a rate of 24 frames per second. When the images are combined and displayed in order, the illusion of motion is achieved.[6]");
        return thirdFragmentRootView;
    }

}
