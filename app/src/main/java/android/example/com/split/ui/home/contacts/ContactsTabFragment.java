package android.example.com.split.ui.home.contacts;


import android.content.Context;
import android.example.com.split.R;
import android.example.com.split.data.entity.User;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class ContactsTabFragment extends Fragment {

    private List<User> dataset;

    public ContactsTabFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Initialize dataset, this data would usually come from a local content provider or remote server.
        initDataset();
    }

    // Create dummy data
    private void initDataset() {
        dataset = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            User user = new User();
            user.setFirstName("Dummy Contact " + i);
            dataset.add(user);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tab_contacts, container, false);

        RecyclerView mRecyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerView_fragment_tab_contacts);
        mRecyclerView.setHasFixedSize(true);

        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);

        ContactsRecyclerAdapter mAdapter = new ContactsRecyclerAdapter(dataset);
        mRecyclerView.setAdapter(mAdapter);

        return rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }

    @Override
    public void onStart() {
        super.onStart();

    }
}
