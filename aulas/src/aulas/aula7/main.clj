(ns aulas.aula7.main)

(def earth-gravity 10)
(def G 6.67408E-11)

; Q1

(defn triple
  "Calculate the triple of num"
  [num]
  (* 3 num))

; Tests
(println "Exercise 1")
(println (triple 3))
(println "")

; Q2

(defn get-odd
  "Get odd numbers of some given collection"
  [collection]
  (filter odd? collection))

; Tests
(println "Exercise 2")
(println (get-odd [2 3 5 7 9 10]))
(println "")

; Q3

(defn reverse-coll
  "Reverse some given collection"
  [collection]
  (rseq collection))

(defn reverse-strings
  "Reverse the strings in some given collection"
  [collection]
  (map #(apply str (reverse %)) collection))

; Tests
(println "Exercise 3")
(println (reverse-coll ["banana" "apple" "watermelon"]))
(println (reverse-strings ["banana" "apple" "watermelon"]))
(println "")

; Q4

(defn double-sum
  "Calculate the double of num1 + num2"
  [collection]
  (* 2 (apply + collection)))

; Tests
(println "Exercise 4")
(println (double-sum [1 2 3 4 5]))
(println "")

; Q5

(defn format-person
  "Return a formatted string with person's data"
  [person]
  (str "Nome: " (get person :nome) ", Idade: " (get person :idade)))

; Tests
(println "Exercise 5")
(println (format-person {:nome "Ana" :idade 7}))
(println "")

; Q6

(defn get-higher-than-10
  "Get all numbers that are higher than or equal to 10"
  [collection]
  (filter #(>= % 10) collection))

; Tests
(println "Exercise 6")
(println (get-higher-than-10 [2 4 10 11 12]))
(println "")

; Bonus

; B1

(defn gravitational-force
  "Calculate the gravitational force (weight force) of a body on earth"
  [mass]
  (* mass earth-gravity))

; Tests
(println "Bonus exercise 1")
(println (gravitational-force 5) "N")
(println "")

; B2

(defn force-between-two-bodies
  "Calculate the force between two bodies"
  [mass1 mass2 distance]
  (-> G
      (* mass1 mass2)
      (/ (Math/pow distance 2))))

; Tests
(println "Bonus exercise 2")
(println (force-between-two-bodies 5 7 2) "N")
(println (force-between-two-bodies 5.972E24 5 6.378E6) "N")