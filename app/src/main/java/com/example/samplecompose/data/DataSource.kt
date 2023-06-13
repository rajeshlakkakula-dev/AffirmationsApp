package com.example.samplecompose.data

import com.example.samplecompose.R
import com.example.samplecompose.model.Affirmation

class DataSource {

    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.af1, R.drawable.image1),
            Affirmation(R.string.af2, R.drawable.image2),
            Affirmation(R.string.af3, R.drawable.image3),
            Affirmation(R.string.af4, R.drawable.image4),
            Affirmation(R.string.af5, R.drawable.image5),
            Affirmation(R.string.af6, R.drawable.image6),
            Affirmation(R.string.af7, R.drawable.image7),
            Affirmation(R.string.af8, R.drawable.image8),
            Affirmation(R.string.af9, R.drawable.image9),
            Affirmation(R.string.af10, R.drawable.image10),

            )


    }
}