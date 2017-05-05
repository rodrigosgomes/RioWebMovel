package br.com.petrobras.up22.riowmovel;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import static br.com.petrobras.up22.riowmovel.MainActivity.resources;

public class CategoryAdapter extends FragmentPagerAdapter {

    String tabTitles[] = new String[] {resources.getString(R.string.main_category_name_pending), resources.getString(R.string.main_category_name_ongoing), resources.getString(R.string.main_category_name_closed)};

    public CategoryAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        return new EventosPendentesFragment();
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }

}
