package com.example.catalogemovie

object MovieData {
    private val movieTitle = arrayOf(
        "One Piece: Stampede",
        "Joker",
        "Terminator: Dark Fate",
        "Gemini Man",
        "Maleficent: Mistress of Evil",
        "Ford v Ferrari",
        "El Camino: A Breaking Bad Movie",
        "Doctor Sleep",
        "Dora and the Lost City of Gold",
        "Klaus",
        "Midway")

    private val movieRelease = arrayOf(
        "9 Agt 2019",
        "2 Okt 2019",
        "23 Okt 2019",
        "2 Okt 2019",
        "16 Okt 2019",
        "10 Okt 2019",
        "11 Okt 2019",
        "30 Okt 2019",
        "8 Agt 2019",
        "8 Nov 2019",
        "6 Nov 2019")

    private val movieRuntime = arrayOf(
        "101 min",
        "122 min",
        "128 min",
        "117 min",
        "118 min",
        "152 min",
        "123 min",
        "152 min",
        "102 min",
        "97 min",
        "138 min")

    private val movieGenre = arrayOf(
        "Animation - Action - Advanture",
        "Crime - Thriller - Drama",
        "Action - Science Fiction",
        "Action - Thriller",
        "Fantasy - Adventure - Family",
        "Drama - Action - History",
        "Crime - Drama - Thriller",
        "Horror - Drama - Fantasy",
        "Adventure - Comedy - Family",
        "Animation - Family - Adventure - Comedy",
        "War - History - Action - Drama")

    private val movieCompanies = arrayOf(
        "Toei Animation",
        "DC Entertaiment",
        "Lightstrom Entertaiment",
        "Skydance Media",
        "Walt Disney Picture",
        "Chernin Entertaiment",
        "Sony Pictures Television",
        "Vertigo Entertaiment",
        "Nickelodeon Movies",
        "The SPA Studios",
        "Centropolis Entertaiment")

    private val movieDescription = arrayOf(
        "The world's boldest buccaneers set sail for the great Pirate Festival, where the Straw Hats join a mad-dash race to find Gol D.Roger's treasure. There's just one little problem. An old member of Roger's crew has a sinister score to settle. All bets are off when the most iconic pirates of One Piece history band together for a swashbuckling showdown, the likes of which have never been seen!",
        "Forever alone in a crowd, failed comedian Arthur Fleck seeks connection as he walks the streets of Gotham City. Arthur wears two masks the one he paints for his day job as a clown, and the guise he projects in a futile attempt to feel like he's part of the world around him. Isolated, bullied and disregarded by society, Fleck begins a slow descent into madness as he transforms into the criminal mastermind known as the Joker.",
        "In Mexico City, a newly modified liquid Terminator the Rev-9 model arrives from the future to kill a young factory worker named Dani Ramos. Also sent back in time is Grace, a hybrid cyborg human who must protect Ramos from the seemingly indestructible robotic assassin. But the two women soon find some much-needed help from a pair of unexpected allies seasoned warrior Sarah Connor and the T-800 Terminator.",
        "Henry Brogan is an elite 51-year-old assassin who's ready to call it quits after completing his 72nd job. His plans get turned upside down when he becomes the target of a mysterious operative who can seemingly predict his every move. To his horror, Brogan soon learns that the man who's trying to kill him is a younger, faster, cloned version of himself",
        "Maleficent travels to a grand old castle to celebrate young Aurora's upcoming wedding to Prince Phillip. While there, she meets Aurora's future mother in law a conniving queen who hatches a devious plot to destroy the land's fairies. Hoping to stop her, Maleficent joins forces with a seasoned warrior and a group of outcasts to battle the queen and her powerful army.",
        "American automotive designer Carroll Shelby and fearless British race car driver Ken Miles battle corporate interference, the laws of physics and their own personal demons to build a revolutionary vehicle for the Ford Motor Co. Together, they plan to compete against the race cars of Enzo Ferrari at the 24 Hours of Le Mans in France in 1966.",
        "The Netflix Event EL CAMINO: A BREAKING BAD MOVIE reunites fans with Jesse Pinkman (Emmy-winner Aaron Paul). In the wake of his dramatic escape from captivity, Jesse must come to terms with his past in order to forge some kind of future. This gripping thriller is written and directed by Vince Gilligan, the creator of Breaking Bad.",
        "Struggling with alcoholism, Dan Torrance remains traumatized by the sinister events that occurred at the Overlook Hotel when he was a child. His hope for a peaceful existence soon becomes shattered when he meets Abra, a teen who shares his extrasensory gift of the shine. Together, they form an unlikely alliance to battle the True Knot, a cult whose members try to feed off the shine of innocents to become immortal.",
        "Having spent most of her life exploring the jungle, nothing could prepare Dora for her most dangerous adventure yet -- high school. Accompanied by a ragtag group of teens and Boots the monkey, Dora embarks on a quest to save her parents while trying to solve the seemingly impossible mystery behind a lost Incan civilization.",
        "After proving himself to be the worst postman at the academy, a postman is posted to a frozen town in the North where he discovers Santa Claus is hiding out.",
        "On Dec. 7, 1941, Japanese forces launch a devastating attack on Pearl Harbor, the U.S. naval base in Hawaii. Six months later, the Battle of Midway commences on June 4, 1942, as the Japanese navy once again plans a strike against American ships in the Pacific. For the next three days, the U.S. Navy and a squad of brave fighter pilots engage the enemy in one of the most important and decisive battles of World War II.")

    private val moviePhoto = intArrayOf(
        R.drawable.onepiece,
        R.drawable.joker,
        R.drawable.terminator,
        R.drawable.geminiman,
        R.drawable.maleficent,
        R.drawable.fordvferrary,
        R.drawable.elcalmino,
        R.drawable.doctor,
        R.drawable.dora,
        R.drawable.klaus,
        R.drawable.midway)

    val ListData: ArrayList<Data>
        get(){
            val list = arrayListOf<Data>()
            for (position in movieTitle.indices){
                val data = Data(title = "",description = "",genre = "", runtime = ""
                ,realese = "",companies = "",photo = 0)
                data.title = movieTitle[position]
                data.runtime = movieRuntime[position]
                data.genre = movieGenre[position]
                data.realese = movieRelease[position]
                data.companies = movieCompanies[position]
                data.description = movieDescription[position]
                data.photo = moviePhoto[position]


                list.add(data)

            }
            return list
        }



}