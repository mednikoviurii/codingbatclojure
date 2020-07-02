(ns codingbatclojure.array1)

(defn firstLast6 [numbers]

    (println "first last 6")

    (def isFirst (= (first numbers) 6))
    (def isLast (= (last numbers) 6))

    (if (or (true? isFirst) (true? isLast))
        (println "true")
        (println "false")
    
    )

)

(firstLast6 (seq [1 2 6]))
(firstLast6 (seq [6 1 2 3]))
(firstLast6 (seq [13 6 1 2 3]))

(defn sameFirstLast [numbers]

    (println "same first last")

    (if (= (first numbers) (last numbers))
        (println "true")
        (println "false")
    )
)

(sameFirstLast (seq [1 2 3]))
(sameFirstLast (seq [1 2 3 1]))
(sameFirstLast (seq [1 2 1]))

(defn sum3 [numbers]

    (println "sum 3")
    (def sum (reduce + numbers))
    (println sum)

)

(sum3 (seq [1 2 3]))
(sum3 (seq [5 11 2]))
(sum3 (seq [7 0 0]))

(defn reverse3 [numbers]
    (println "reverse 3")
    (println (reverse numbers))
)

(reverse3 (seq [1 2 3]))
(reverse3 (seq [5 11 9]))
(reverse3 (seq [7 0 0]))

(defn sum2 [numbers]
    (println "sum 2")
    (def values (take 2 numbers))
    (def sum (reduce + values))
    (println sum)
)

(sum2 (seq [1 2 3]))
(sum2 (seq [1 1]))
(sum2 (seq [1 1 1 1]))
(sum2 (seq [4 5 6]))
(sum2 (seq []))

(defn no23 [numbers]
    (println "no 2 3")
    (def has23 (or (.contains numbers 2) (.contains numbers 3) ))
    (if (true? has23)
        (println "false")
        (println "true")
    )
)

(no23 (seq [4 5]))
(no23 (seq [4 2]))
(no23 (seq [3 5]))

(defn makePi []
    (println "make pi")
    (println (seq [3 1 4]))
)

(makePi)

(defn frontPiece [numbers]
    (println "Front piece")
    (println (take 2 numbers))
)

(frontPiece (seq [1 2 3]))
(frontPiece (seq [1 2]))
(frontPiece (seq [1]))

(defn plusTwo [a b]
    (println "plus two")
    (println (concat a b))
)

(plusTwo (seq [1 2]) (seq [3 4]))
(plusTwo (seq [4 4]) (seq [2 2]))
(plusTwo (seq [9 2]) (seq [3 4]))