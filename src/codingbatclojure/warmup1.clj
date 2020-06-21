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
    (println "\nNear hundred")
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

(defn parrotTrouble [hour talking]
    (println "Parrot trouble")
        (if (and true? talking (or (< hour 7) (> hour 20)
        ))
            (println true)
            (println false)
        )
)

(parrotTrouble 6 true)
(parrotTrouble 7 true)
(parrotTrouble 6 false)


(defn sumDouble [a b]
    (println "Sum double")
    (if (= a b)
        (println (* 2 (+ a b)))
        (println (+ a b))
    )
)

(sumDouble 1 2)
(sumDouble 3 2)
(sumDouble 2 2)

(defn makes10 [a b]
    (println "Makes10")
    (if (or 
            (= 10 (+ a b)) 
            (or (= 10 a) (= 10 b)
    ))
        (println true)
        (println false)

    )

)

(makes10 9 10)
(makes10 9 9)
(makes10 1 9)

(defn isTeen [x]
    (cond 
        (and (>= x 13) (<= x 19)) true
        :else false
    )
)

(defn loneTeen [a b]
    (println "\n Lone teen")
    (if (
        and (or (isTeen a) (isTeen b)) 
            (not= a b)
    )
        (println true)
        (println false)
    )
)

(loneTeen 13 99)
(loneTeen 21 19)
(loneTeen 13 13)

(defn diffWith10 [x]
    (Math/abs (- x 10))
)

(defn close10 [a b]
    (println "\nClose10")
    (def diffA (diffWith10 a))
    (def diffB (diffWith10 b))
    (cond
        (< diffA diffB) (println a)
        (> diffA diffB) (println b)
        :else (println 0)
    )
)

(close10 8 13)
(close10 13 8)
(close10 13 7)