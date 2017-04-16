(ns relation.aux
  (:gen-class)
  )

(defn num-to-key [x]
  (keyword (str x))
  )

(defn conj-assoc [list key value]
  (assoc list key (conj (key list) value)))

(defn delete-element [vc pos]
  (vec (concat
        (subvec vc 0 pos)
        (subvec vc (inc pos)))))

(defn conj-dissoc [list key value]
  (assoc list key (delete-element (key list) (.indexOf (key list) value))))

