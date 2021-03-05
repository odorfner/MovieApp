package com.example.movieapp

data class MovieData( var title: String="",
                      var description: String="",
                      var rating: Float,
                      var genres: String?="",
                      var creators: String="",
                      var actors: String="")

/*    var rating: Float = 0.0f
        set(value){
            if (value in 0.0..5.0) field = value
            else throw IllegalArgumentException("Rating value must be between 0 and 5")
        }
    var genres: String?= null
    var creators: String=""
    var actors: String=""*/
