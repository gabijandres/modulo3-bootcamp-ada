(ns aulas.aula5.main)

(def names ["Beatriz", "Gabriele", "Jade", "Lucas"])
(def values-map {:a 1 :b 2 :c 3 :d 4})

(defn describe-number
  "Given a number n, returns a descriptions vector"
  [num]
  (cond-> []
          (pos? num) (conj "positive")
          (even? num) (conj "even")
          (odd? num) (conj "odd")
          (= num 0) (conj "zero")))

(defn generate-salutation
  "Generates a greeting, given a greeting and any name"
  [salutation name]
  (str salutation ", " name "\n"))

(defn salute-everyone
  "Generates a list of uppercase greetings"
  [salutation names]
  (as-> names n
        (map (partial generate-salutation salutation) n)
        (map #(clojure.string/upper-case %) n)))

(defn sum
  "Given a number and a map item, calculates the sum of the number and the value of that map item or throw an exception if the value is not numerical"
  [acc item]
  (try (+ acc (val item))
       (catch Exception _
         (throw (Exception. (str "The key " (str (key item)) " is not a number."))))))

(defn add-average
  "Given a map with numerical values, calculates these values average and add it to the map"
  [values-map]
  (as-> values-map m
        (reduce sum 0 m)
        (/ m (count values-map))
        (assoc values-map :average m)))