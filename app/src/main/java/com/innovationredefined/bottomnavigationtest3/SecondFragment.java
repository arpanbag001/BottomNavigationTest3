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
public class SecondFragment extends Fragment {
    View secondFragmentRootView;


    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        secondFragmentRootView = inflater.inflate(R.layout.fragment_first, container, false);
        TextView textView = secondFragmentRootView.findViewById(R.id.textview);
        textView.setText("In information technology, a backup, or the process of backing up, refers to the copying into an archive file of computer data so it may be used to restore the original after a data loss event. The verb form is \"back up\" (a phrasal verb), whereas the noun and adjective form is \"backup\".[1]\n" +
                "\n" +
                "Backups have two distinct purposes. The primary purpose is to recover data after its loss, be it by data deletion or corruption. Data loss can be a common experience of computer users; a 2008 survey found that 66% of respondents had lost files on their home PC.[2] The secondary purpose of backups is to recover data from an earlier time, according to a user-defined data retention policy, typically configured within a backup application for how long copies of data are required.[3] Though backups represent a simple form of disaster recovery and should be part of any disaster recovery plan, backups by themselves should not be considered a complete disaster recovery plan. One reason for this is that not all backup systems are able to reconstitute a computer system or other complex configuration such as a computer cluster, active directory server, or database server by simply restoring data from a backup.[4]\n" +
                "\n" +
                "Since a backup system contains at least one copy of all data considered worth saving, the data storage requirements can be significant. Organizing this storage space and managing the backup process can be a complicated undertaking. A data repository model may be used to provide structure to the storage. Nowadays, there are many different types of data storage devices that are useful for making backups. There are also many different ways in which these devices can be arranged to provide geographic redundancy, data security, and portability.\n" +
                "\n" +
                "Before data are sent to their storage locations, they are selected, extracted, and manipulated. Many different techniques have been developed to optimize the backup procedure. These include optimizations for dealing with open files and live data sources as well as compression, encryption, and de-duplication, among others. Every backup scheme should include dry runs that validate the reliability of the data being backed up. It is important to recognize the limitations and human factors involved in any backup scheme.");
        return secondFragmentRootView;
    }

}
