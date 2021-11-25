package com.kei.aplikasiandroiduntukpemulasubmission.data

import com.kei.aplikasiandroiduntukpemulasubmission.R

object DataJacket {
    private val jacketNames = arrayOf("TIRO WINDBREAKER",
        "TERREX PARLEY AGRAVIC WIND.RDY WINDBREAKER",
        "DAME IMA VISIONARY HOODIE",
        "FIVE TEN ALL-MOUNTAIN RAIN JACKET",
        "MARATHON TRANSLUCENT JACKET",
        "TERREX AGRAVIC PRO TRAIL RUNNING RAIN JACKET",
        "BSC RAIN.RDY JACKET",
        "BOSTON MARATHON® OWN THE RUN REFLECTIVE WIND JACKET",
        "ADIDAS SPORTSWEAR MOUNTAIN GRAPHIC HALF-ZIP SWEATSHIRT",
        "ADIDAS SPORTSWEAR COLORBLOCK HOODIE")

    private val jacketDetails = arrayOf(
        "A SOCCER-INSPIRED WINDBREAKER FOR BEYOND THE TOUCHLINE.\nBorn on the soccer pitch. Worn everywhere else. Bold blocks of color and minty shades give off summery vibes on this adidas Tiro Windbreaker. Made with recycled materials, its tough shell has a mesh lining to keep you comfortable when it\'s zipped up. The slim fit and drawcord-adjustable hem ensure you stay streamlined when the winds are trying their best to knock you off course.",
        "A PACKABLE WINDBREAKER JACKET FOR TRAIL RUNNING.\nThis adidas Terrex trail running windbreaker offers one more reason to hit the trail when the weather says stay inside. WIND.RDY resists wind to keep you comfortable in windy, damp conditions. Its lightweight design stows into a pocket for easy packing. It features Parley Ocean Plastic, upcycled plastic waste intercepted on remote islands, beaches, coastal communities and shorelines, preventing it from polluting our oceans.",
        "A HOODED SWEATSHIRT WITH DAME STYLE.\nPull on some Damian Lil lard style with this classic-look hoodie from adidas Basketball. Adjust the hood for added coverage and stick your hands in the kangaroo pocket if the temperature starts to plummet. The Dame logo on the chest flashes a finishing touch.This product is made with Primegreen, a series of high-performance recycled materials.",
        "A LIGHTWEIGHT RAIN JACKET FOR WET WEATHER RIDES. \n Cool misty morning or afternoon showers, the adidas Five Ten All-Mountain Rain Jacket keeps you dry and on the bike. RAIN.RDY keeps out wind and rain, while elastic cuffs, hem and hood further seal out the elements while you ride. Its lightweight build makes for easy packing. Zip out the showers and keep on riding.",
        "A HOODED RUNNING JACKET FOR TRAINING IN THE WIND AND RAIN. \n The reasons you run are clear. For strength. Stamina. And now, to do your part for the planet. Zip into the light, breathable protection of this adidas running jacket. It features recycled material as part of adidas\' commitment to help end plastic waste. And it\'s treated to repel water and wind so you stay dry in stormy weather.",
        "A TRAIL RUNNER\'S SUMMER COMPANION.\nOn a warm Spring day, you go for a run on a trail where you can enjoy the serenity of nature. The weather forecasts said it might rain today. A good day to keep this rain jacket handy. It\'s fully waterproof yet stretchy and breathable. Three light layers repel the water and stretch together to keep up with your body\'s movement. Ventilation openings on the side allow your skin to breathe without letting any water in. The back pleat makes it easier to wear a jacket with a vest. All with reflective overlays that help you stay visible in the dark and a pocket to pack the jacket neatly into your bag. The ultimate lightweight trail running rain jacket has arrived. Now it\'s time to take on the trail.",
        "A WATERPROOF AND BREATHABLE RAIN JACKET FOR OUTDOOR ADVENTURE NEAR AND FAR.\nDamp morning on the trail or showers in the forecast, this adidas rain jacket offers breathable coverage for wet weather adventures. RAIN.RDY seals out wind and rain while keeping you comfortable on the inside, too. Zip up, adjust the hood and hem and keep on hiking on until the showers pass.",
        "A HOODED WINDBREAKER MADE FOR EASY, NATURAL MOVEMENT.\nFrom Hopkinton to Heartbreak Hill, the Boston Marathon® will take everything you\\'ve got. Especially in lousy weather. Keep your spirits high through training runs and race day in this adidas running jacket. It\'s made with water-repellent fabric to handle gusts and showers, and reflective details that stand out in low-light situations.\nThis product is made with recycled content as part of our ambition to end plastic waste.",
        "A HALF-ZIP SWEATSHIRT FEATURING A BOLD MOUNTAIN GRAPHIC.\nIs where you are right now where you want to be? Tell the story with this towering mountain landscape graphic and make your statement even louder in the streets. This half-zip sweatshirt can be worn as is or cinched with the bungee-adjustable hem. Head out in this nature graphic with pride, knowing it\'s made with recycled materials as part of adidas\' commitment to help end plastic waste.\nThis product is made with Primegreen, a series of high-performance recycled materials.",
        "A PLUSH FLEECE HOODIE MADE FOR ATHLETES DURING OFF HOURS.\nCozy fleece and making the world better at the same time? Yes, please. Take it real, real chill on rest days every time you zip up this adidas hoodie. Disrupt the status quo, subtly. Angular 3-Stripes and bold colors make a statement without you saying a word.\nThis product is made with Primegreen, a series of high-performance recycled materials.")

    private val jacketImages = intArrayOf(
        R.drawable.jacket_one,
        R.drawable.jacket_two,
        R.drawable.jacket_three,
        R.drawable.jacket_four,
        R.drawable.jacket_five,
        R.drawable.jacket_six,
        R.drawable.jacket_seven,
        R.drawable.jacket_eight,
        R.drawable.jacket_nine,
        R.drawable.jacket_ten
    )

    private val jacketPrice = arrayOf(
        "$65",
        "$80",
        "$49",
        "$200",
        "$100",
        "$300",
        "$100",
        "$85",
        "$100",
        "$65",
    )

    val listJacket : ArrayList<Jacket>
        get() {
            val list = arrayListOf<Jacket>()
            for (position in jacketNames.indices){
                val jacket = Jacket()
                jacket.name = jacketNames[position]
                jacket.desc = jacketDetails[position]
                jacket.image = jacketImages[position]
                jacket.price = jacketPrice[position]
                list.add(jacket)
            }
            return list
        }
}