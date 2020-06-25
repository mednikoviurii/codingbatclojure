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
