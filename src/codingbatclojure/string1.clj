(ns codingbatclojure.string1)
(use '[clojure.string :as str])


(defn helloName [name]
    (println "Hello name")
    (format "Hello, %s" name)
)

(println (helloName "Bob"))
(println (helloName "Alice"))
(println (helloName "X"))


(defn makeOutWord [out, word]
    (println "make out word")
    (def start (subs out 0 2))
    (def end (subs out 2))
    (println start word end)
)

(makeOutWord "<<>>" "Yay")
(makeOutWord "<<>>" "WooHoo")
(makeOutWord "[[]]" "word")

(defn firstHalf [word]
    (println "First half")
    (def half (/ (count word) 2))
    (subs word 0 half)
)

(println (firstHalf "WooHoo"))
(println (firstHalf "HelloThere"))
(println (firstHalf "abcdef"))

(defn nonStart [a,b]
    (println "Non start")
    (println (subs a 1) (subs b 1)
    )
)

(nonStart "Hello" "There")
(nonStart "Clojure" "code")
(nonStart "shotl" "clojure")

(defn theEnd [s front]
    (println "The end")
    (if (true? front)
        (println (subs s 0 1))
        (println 
            (subs s 
                (- (count s) 1)
            )
        )
    )

)

(theEnd "Hello" true)
(theEnd "Hello" false)
(theEnd "oh" true)

(defn makeAbba [a b]
    (def words (
        seq [a b]
    ))
    
    (println words (clojure.core/reverse words))
)

(makeAbba "Hi" "There")
(makeAbba "Hello" "Alice")
(makeAbba "What" "Up")

(defn seeColor [s]
    (println "see color")
    (cond
        (str/starts-with? s "red") (println "red")
        (str/starts-with? s "blue") (println "blue")
        :else (println "")
    )
)

(seeColor "redxx")
(seeColor "xxred")
(seeColor "blueTimes")