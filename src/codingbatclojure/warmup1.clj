(ns codingbatclojure.warmup1)

(defn sleepin [weekday vacation]
    (println "\nSleeping day")
    (if (or (not weekday) vacation)
        (println "Sleeping day")
        (println "No sleeping day")
        )
)

(sleepin false false)
(sleepin true false)
(sleepin false true)

(defn diff21 [n]
    (println "\n diff21")
    (println (- (Math/abs 21) (Math/abs n)))
)

(diff21 19)
(diff21 10)
(diff21 21)

(defn nearHundred [n]
    (println "Near hundred")
    (if (or 
    (<= (Math/abs (- 100 n)) 10) 
    (<= (Math/abs (- 200 n)) 10))
        (println true)
        (println false)
    )

)

(nearHundred 93)
(nearHundred 90)
(nearHundred 89)

(defn monkeyTrouble [aSmile bSmile]
    (println "\nMonkey trouble")
    (if (= aSmile bSmile)
        (println true)
        (println false)
    )
)

(monkeyTrouble true true)
(monkeyTrouble false false)
(monkeyTrouble true false)