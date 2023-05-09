(ns aulas.aula2.areas
  (:import (java.lang Math)))

(def pi Math/PI)

(defn calculate-square
  "Returns the square of the given value"
  [value]
  (Math/pow value 2))

(defn square-area
  "Returns the square's area"
  [size]
  (calculate-square size))

(defn triangle-area
  "Returns the triangle's area"
  [base height]
  (-> base
      (* height)
      (/ 2)))

(defn rectangle-area
  "Returns the rectangle's area"
  [base height]
  (-> base
      (* height)))

(defn circle-area
  "Returns the circle's area"
  [radius]
  (-> radius
      (calculate-square)
      (* pi)))

(defn trapeze-area
  "Returns the trapeze's area"
  [major-base minor-base height]
  (-> major-base
      (+ minor-base)
      (* height)
      (/ 2)))