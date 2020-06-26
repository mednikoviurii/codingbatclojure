(ns codingbatclojure.logic1)

(defn caughtSpeeding [speed birthday]

    (println "caught speeding")

    (if (false? birthday) 
        (cond 
            (<= speed 60) (println "0")
            (and (>= speed 61) (<= speed 80)) (println "1")
            :else ("2")
        ) 
        (cond 
            (<= speed 65) (println "0")
            (and (>= speed 66) (<= speed 85)) (println "1")
            :else (println "2")
        )
    )

)

 
(caughtSpeeding 60 false)
(caughtSpeeding 65 false)
(caughtSpeeding 65 true)

(defn squirellPlay [temp summer]

    (println "squirell play")

    (if (false? summer)

        (
            if (and (>= temp 60) (<= temp 90))
            (println "true")
            (println "false")
        )
        (
            if (and (>= temp 60) (<= temp 100))
            (println "true")
            (println "false")
        )

    )

)

(squirellPlay 70 false)
(squirellPlay 95 false)
(squirellPlay 95 true)

(defn more20 [n]

    (println "more 20")
    (def diff (rem n 20))
    (println "difference = " diff)
    (if (<= diff 2)
        (println "true")
        (println "false")
    )
)

(more20 21)
(more20 22)
(more20 31) ;false
(more20 59) ;false 

(defn dateFashion [you mate]

    (println "date fashion")
    (def youStylish (>= you 8))
    (def mateStylish (>= mate 8))

    (cond 
        (or (<= you 2) (<= mate 2)) (println "0")
        (or (true? youStylish) (true? mateStylish)) (println "2")
        :else (println "1")
    )
)

(dateFashion 5 10)
(dateFashion 5 2)
(dateFashion 5 5)
(dateFashion 9 2)
(dateFashion 5 3)

(defn alarmClock [day weekend]
    (println "alarm clock")

    (def workingday (and (> day 0) (< day 6)
    ))

    ; (println "workingday=" workingday)

    (cond
        (and (true? workingday) (true? weekend) ) (println "10:00")
        (and (true? workingday) (false? weekend)) (println "7:00")
        (and (false? workingday) (true? weekend)) (println "off")
        (and (false? workingday) (false? weekend)) (println "10:00")
        
    )
)

(alarmClock 1 false) ;7
(alarmClock 5 false) ;7
(alarmClock 0 false) ;10
(alarmClock 0 true) ;off