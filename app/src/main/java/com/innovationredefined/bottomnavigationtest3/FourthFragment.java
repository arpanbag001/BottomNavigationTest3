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
public class FourthFragment extends Fragment {
    View fourthFragmentRootView;


    public FourthFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fourthFragmentRootView = inflater.inflate(R.layout.fragment_first, container, false);
        TextView textView = fourthFragmentRootView.findViewById(R.id.textview);
        textView.setText("Eyes are organs of the visual system. They provide organisms with vision, the ability to receive and process visual detail, as well as enabling several photo response functions that are independent of vision. Eyes detect light and convert it into electro-chemical impulses in neurons. In higher organisms, the eye is a complex optical system which collects light from the surrounding environment, regulates its intensity through a diaphragm, focuses it through an adjustable assembly of lenses to form an image, converts this image into a set of electrical signals, and transmits these signals to the brain through complex neural pathways that connect the eye via the optic nerve to the visual cortex and other areas of the brain. Eyes with resolving power have come in ten fundamentally different forms, and 96% of animal species possess a complex optical system.[1] Image-resolving eyes are present in molluscs, chordates and arthropods.[2]\n" +
                "\n" +
                "The simplest \"eyes\", such as those in microorganisms, do nothing but detect whether the surroundings are light or dark, which is sufficient for the entrainment of circadian rhythms.[3] From more complex eyes, retinal photosensitive ganglion cells send signals along the retinohypothalamic tract to the suprachiasmatic nuclei to effect circadian adjustment and to the pretectal area to control the pupillary light reflex.\n" +
                "Complex eyes can distinguish shapes and colours. The visual fields of many organisms, especially predators, involve large areas of binocular vision to improve depth perception. In other organisms, eyes are located so as to maximise the field of view, such as in rabbits and horses, which have monocular vision.\n" +
                "\n" +
                "The first proto-eyes evolved among animals 600 million years ago about the time of the Cambrian explosion.[4] The last common ancestor of animals possessed the biochemical toolkit necessary for vision, and more advanced eyes have evolved in 96% of animal species in six of the ~35[a] main phyla.[1] In most vertebrates and some molluscs, the eye works by allowing light to enter and project onto a light-sensitive panel of cells, known as the retina, at the rear of the eye. The cone cells (for colour) and the rod cells (for low-light contrasts) in the retina detect and convert light into neural signals for vision. The visual signals are then transmitted to the brain via the optic nerve. Such eyes are typically roughly spherical, filled with a transparent gel-like substance called the vitreous humour, with a focusing lens and often an iris; the relaxing or tightening of the muscles around the iris change the size of the pupil, thereby regulating the amount of light that enters the eye,[5] and reducing aberrations when there is enough light.[6] The eyes of most cephalopods, fish, amphibians and snakes have fixed lens shapes, and focusing vision is achieved by telescoping the lens—similar to how a camera focuses.[7]\n" +
                "\n" +
                "Compound eyes are found among the arthropods and are composed of many simple facets which, depending on the details of anatomy, may give either a single pixelated image or multiple images, per eye. Each sensor has its own lens and photosensitive cell(s). Some eyes have up to 28,000 such sensors, which are arranged hexagonally, and which can give a full 360° field of vision. Compound eyes are very sensitive to motion. Some arthropods, including many Strepsiptera, have compound eyes of only a few facets, each with a retina capable of creating an image, creating vision. With each eye viewing a different thing, a fused image from all the eyes is produced in the brain, providing very different, high-resolution images.\n" +
                "\n" +
                "Possessing detailed hyperspectral colour vision, the Mantis shrimp has been reported to have the world's most complex colour vision system.[8] Trilobites, which are now extinct, had unique compound eyes. They used clear calcite crystals to form the lenses of their eyes. In this, they differ from most other arthropods, which have soft eyes. The number of lenses in such an eye varied, however: some trilobites had only one, and some had thousands of lenses in one eye.\n" +
                "\n" +
                "In contrast to compound eyes, simple eyes are those that have a single lens. For example, jumping spiders have a large pair of simple eyes with a narrow field of view, supported by an array of other, smaller eyes for peripheral vision. Some insect larvae, like caterpillars, have a different type of simple eye (stemmata) which usually provides only a rough image, but (as in sawfly larvae) can possess resolving powers of 4 degrees of arc, be polarization sensitive and capable of increasing its absolute sensitivity at night by a factor of 1,000 or more.[9] Some of the simplest eyes, called ocelli, can be found in animals like some of the snails, which cannot actually \"see\" in the normal sense. They do have photosensitive cells, but no lens and no other means of projecting an image onto these cells. They can distinguish between light and dark, but no more. This enables snails to keep out of direct sunlight. In organisms dwelling near deep-sea vents, compound eyes have been secondarily simplified and adapted to spot the infra-red light produced by the hot vents–in this way the bearers can spot hot springs and avoid being boiled alive.[10]");
        return fourthFragmentRootView;
    }

}
