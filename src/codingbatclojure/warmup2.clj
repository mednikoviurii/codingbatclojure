(ns codingbatclojure.warmup2)

(use '[clojure.string :as str])

(defn frontTimes [s x]
    (println "Front times")
    (def front (subs s 0 3))
    (def result (str/join (repeat x front)))
    (println result)
)

(frontTimes "Chocolate" 2)
(frontTimes "Chocolate" 3)
(frontTimes "Abc" 3)

(defn arrayFront9 [numbers]
    (println "array front 9")
    (def front (take 4 numbers))
    (if (.contains front 9)
        (println "true")
        (println "false")
    )
)

(arrayFront9 [1 2 9 3 4])
(arrayFront9 [1 2 3 4 9])
(arrayFront9 [1 2 3 4 5])

(defn stringYak [s]
    (println "string yak")
    (def result (str/replace s "yak" ""))
    (println result)
)

(stringYak "yakpak")
(stringYak "pakyak")
(stringYak "yak123ya")

(defn stringTimes [s x]
    (println "string times")
    (def result (str/join (repeat x s)))
    (println result)
)

(stringTimes "Hi" 2)
(stringTimes "Hi" 3)
(stringTimes "Hi" 1)
