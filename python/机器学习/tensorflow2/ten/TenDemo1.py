import tensorflow as tf
import numpy as np

data = tf.keras.datasets.mnist

# print(data.load_data.__doc__)
(x_train,y_train),(x_test,y_test)=data.load_data()

# np.array(data.load_data())

print(np.array(x_train).reshape(()))