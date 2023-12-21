package com.example.data.model


//41.83149402323753, 16.1914942252384
val POI_PLACES = listOf(
    PoiPlace(
        0,
        "Castel del Monte",
        "An octagonal medieval castle, near the city of Andria. Built by the Holy Roman Emperor Fredrick II",
        41.0848,
        16.2709
    ),
    PoiPlace(
        1,
        "Trani Cathedral",
        "Romanesque cathedral, built between 1099 and 1149, in white stone and by the sea.",
        41.2822,
        16.4183
    ),
    PoiPlace(
        2,
        "Alberobello",
        "Town near Bari, Apulia, famous for its unique, round dry-stone built trulli houses. UNESCO World Heritage Site.",
        40.7834,
        17.2396
    ),
    PoiPlace(
        3,
        "Bari Old Town",
        "Barivecchia, or Old Bari, as prawl of streets and passageways making up the section of the city to the north of the modern Murat area",
        41.1284,
        16.8686
    ),
    PoiPlace(
        4,
        "Porto Cesareo Beach",
        "Pristine beach in Porto Cesareo, near Lecce.",
        40.2597,
        17.8947
    ),
    PoiPlace(
        5,
        "Arco di San Felice",
        "Sedimentary, rocky arch situated in the Gargano peninsula (northern Apulia)",
        41.8314,
        16.1914
    )
)

class PoiPlaceList {
    fun getPlaces(): List<PoiPlace> {
        return POI_PLACES
    }

    fun getPlace(placeId: Int): PoiPlace? {
        return POI_PLACES.find { it.id == placeId}
    }
}