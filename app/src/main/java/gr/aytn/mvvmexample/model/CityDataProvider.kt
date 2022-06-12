package gr.aytn.mvvmexample.model

import gr.aytn.mvvmexample.R

class CityDataProvider {
    private val cities = arrayListOf<City>()
    init {
        cities.add(City("Bangkok", R.drawable.bangkok, 12_000_000))
        cities.add(City("Beijing", R.drawable.beijing, 14_000_000))
        cities.add(City("London", R.drawable.london, 11_000_000))
        cities.add(City("NewYork", R.drawable.newyork, 16_000_000))
    }

    fun getCities() = cities

}