package com.example.movieapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.movieapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.floatingActionButton.setOnClickListener {
            Toast.makeText(this, "Added to your favorites", Toast.LENGTH_SHORT).show()
        }
        val showman: MovieData = MovieData(
            "The Greatest Showman",
            "Orphaned, penniless, but ambitious and with a mind crammed with imagination and fresh ideas, the American entertainer, Phineas Taylor Barnum, will always be remembered as the man with the gift to blur the line between reality and fiction. Thirsty for innovation and hungry for success, the son of a tailor manages to open a wax museum; however, he soon shifts focus to the unique and the peculiar, introducing extraordinary, never-seen-before live acts on the circus stage. Now, some people call Barnum\'s rich collection of oddities, an outright freak show; but, when Phineas, obsessed for cheers and respectability, gambles everything on the opera singer, Jenny Lind, to appeal to a high-brow audience, he will lose sight of the most crucial aspect of his life: his family. Will Barnum, the greatest showman, risk it all to be accepted? Written by Nick Riganas",
            4.50f,
            "Biography, Drama, Musical",
            "Michael Gracey, Jenny Bicks, Bill Condon",
            "Hugh Jackman, Michelle Williams, Zac Efron"

        )
        binding.movie = showman

    }
}