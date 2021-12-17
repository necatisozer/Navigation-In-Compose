package com.necatisozer.navigationincompose.data

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

object DataFactory {
    var isLoggedIn by mutableStateOf(false)
    var username by mutableStateOf<String?>(null)
    val movies: List<Movie> = listOf(
        Movie(
            id = "movie1",
            name = "Spider-Man: No Way Home",
            poster = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/1g0dhYtq4irTY1GPXvft6k4YLjm.jpg",
            overview = "Peter Parker is unmasked and no longer able to separate his normal life from the high-stakes of being a super-hero. When he asks for help from Doctor Strange the stakes become even more dangerous, forcing him to discover what it truly means to be Spider-Man."
        ),
        Movie(
            id = "movie2",
            name = "Spider-Man: Far From Home",
            poster = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/4q2NNj4S5dG2RLF9CpXsej7yXl.jpg",
            overview = "Peter Parker and his friends go on a summer trip to Europe. However, they will hardly be able to rest - Peter will have to agree to help Nick Fury uncover the mystery of creatures that cause natural disasters and destruction throughout the continent."
        ),
        Movie(
            id = "movie3",
            name = "Spider-Man: Homecoming",
            poster = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/c24sv2weTHPsmDa7jEMN0m2P3RT.jpg",
            overview = "Following the events of Captain America: Civil War, Peter Parker, with the help of his mentor Tony Stark, tries to balance his life as an ordinary high school student in Queens, New York City, with fighting crime as his superhero alter ego Spider-Man as a new threat, the Vulture, emerges."
        ),
        Movie(
            id = "movie4",
            name = "Spider-Man",
            poster = "https://www.themoviedb.org/t/p/w1280/gSZyYEK5AfZuOFFjnVPUCLvdOD6.jpg",
            overview = "After being bitten by a genetically altered spider at Oscorp, nerdy but endearing high school student Peter Parker is endowed with amazing powers to become the superhero known as Spider-Man."
        ),
        Movie(
            id = "movie5",
            name = "Spider-Man 2",
            poster = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/olxpyq9kJAZ2NU1siLshhhXEPR7.jpg",
            overview = "Peter Parker is going through a major identity crisis. Burned out from being Spider-Man, he decides to shelve his superhero alter ego, which leaves the city suffering in the wake of carnage left by the evil Doc Ock. In the meantime, Parker still can't act on his feelings for Mary Jane Watson, a girl he's loved since childhood. A certain anger begins to brew in his best friend Harry Osborn as well..."
        ),
        Movie(
            id = "movie6",
            name = "Spider-Man 3",
            poster = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/2jLxKF73SAPkyhIWrnv67IH7kJ1.jpg",
            overview = "The seemingly invincible Spider-Man goes up against an all-new crop of villains—including the shape-shifting Sandman. While Spider-Man’s superpowers are altered by an alien organism, his alter ego, Peter Parker, deals with nemesis Eddie Brock and also gets caught up in a love triangle."
        ),
        Movie(
            id = "movie7",
            name = "The Amazing Spider-Man",
            poster = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/fSbqPbqXa7ePo8bcnZYN9AHv6zA.jpg",
            overview = "Peter Parker is an outcast high schooler abandoned by his parents as a boy, leaving him to be raised by his Uncle Ben and Aunt May. Like most teenagers, Peter is trying to figure out who he is and how he got to be the person he is today. As Peter discovers a mysterious briefcase that belonged to his father, he begins a quest to understand his parents' disappearance – leading him directly to Oscorp and the lab of Dr. Curt Connors, his father's former partner. As Spider-Man is set on a collision course with Connors' alter ego, The Lizard, Peter will make life-altering choices to use his powers and shape his destiny to become a hero."
        ),
        Movie(
            id = "movie8",
            name = "The Amazing Spider-Man 2",
            poster = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/c3e9e18SSlvFd1cQaGmUj5tqL5P.jpg",
            overview = "For Peter Parker, life is busy. Between taking out the bad guys as Spider-Man and spending time with the person he loves, Gwen Stacy, high school graduation cannot come quickly enough. Peter has not forgotten about the promise he made to Gwen’s father to protect her by staying away, but that is a promise he cannot keep. Things will change for Peter when a new villain, Electro, emerges, an old friend, Harry Osborn, returns, and Peter uncovers new clues about his past."
        ),
    )
}
