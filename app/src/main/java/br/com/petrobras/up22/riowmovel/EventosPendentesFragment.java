package br.com.petrobras.up22.riowmovel;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class EventosPendentesFragment extends Fragment {

    public EventosPendentesFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.evse_list, container, false);

        final ArrayList<EventoSeguranca> evseList = new ArrayList<EventoSeguranca>();
        evseList.add(new EventoSeguranca("one", "lutti"));
        evseList.add(new EventoSeguranca("two", "otiiko"));
        evseList.add(new EventoSeguranca("three", "tolookosu"));
        evseList.add(new EventoSeguranca("four", "oyyisa"));
        evseList.add(new EventoSeguranca("five","massokka"));
        evseList.add(new EventoSeguranca("six", "temmokka"));
        evseList.add(new EventoSeguranca("seven", "kenekaku"));
        evseList.add(new EventoSeguranca("eight", "kawinta", R.drawable.principal_h_cor));
        evseList.add(new EventoSeguranca("nine", "wo'e"));
        evseList.add(new EventoSeguranca("ten", "na'aacha"));

        // setting up the array adapter
        EventoSegurancaAdapter itemsAdapter= new EventoSegurancaAdapter(getActivity(), evseList,  R.color.branco);

        // finding the listView and setting the adapter to it
        ListView listView = (ListView)rootView.findViewById(R.id.evse_list);
        listView.setAdapter(itemsAdapter);

        return rootView;
    }
}
