import numpy as np
import tensorflow as tf
from tensorflow.python.framework import dtypes

# 1. Setting up initial values
x = np.zeros((7, 7, 3))
x[:, :, 0] = np.mat(
    "0 0 0 0 0 0 0;0 0 1 0 1 0 0;0 2 1 0 1 2 0;0 0 2 0 0 1 0;0 2 0 1 0 0 0;0 0 0 1 2 2 0;0 0 0 0 0 0 0"
).A
x[:, :, 1] = np.mat(
    "0 0 0 0 0 0 0;0 1 0 0 1 1 0;0 0 2 2 1 1 0;0 2 1 2 1 0 0;0 2 1 1 2 2 0;0 1 2 0 2 2 0;0 0 0 0 0 0 0"
).A
x[:, :, 2] = np.mat(
    "0 0 0 0 0 0 0;0 2 1 1 1 1 0;0 2 2 1 2 1 0;0 1 1 0 2 2 0;0 2 1 2 2 0 0;0 1 2 2 0 0 0;0 0 0 0 0 0 0"
).A

x = np.reshape(x, (1, 7, 7, 3))
# print("x:",x)
w = np.zeros((3, 3, 3, 2))
w[:, :, 0, 0] = np.mat("0 0 1;-1 1 1;0 1 0").A
w[:, :, 1, 0] = np.mat("1 1 1;0 1 1;0 1 0").A
w[:, :, 2, 0] = np.mat("-1 0 0;-1 1 1;0 -1 0").A

# w1 = np.zeros((3,3,3)) w[:, :, 0, 1] = np.mat("0 0 0;1 1 -1;-1 1 1").A
w[:, :, 1, 1] = np.mat("0 1 -1;1 1 -1;-1 1 -1").A
w[:, :, 2, 1] = np.mat("1 1 0;-1 -1 0;0 -1 1").A

stride = 2
scope = "conv_in_numpy"
act = tf.nn.relu  # activation pad = 'VALID'  # padding nf = 2  # number of filters rf = 3  # filter size b = [1, 0]  # bias
np_o = np.zeros((1, 3, 3, 2))
s = stride


for z in range(nf):
    # print("z:", z)     h_range = int((x.shape[2] - rf) / s) + 1  # (W - F + 2P) / S     for _h in range(h_range):
        w_range = int((x.shape[1] - rf) / s) + 1  # (W - F + 2P) / S         for _w in range(w_range):
            np_o[0, _h, _w, z] = np.sum(
                x[0, _h * s:_h * s + rf, _w * s:_w * s + rf, :] *
                w[:, :, :, z]) + b[z]

print("np_o0:\n", np_o[0, :, :, 0])
print("np_o1:\n", np_o[0, :, :, 1])

np.testing.assert_almost_equal(tf_o, np_o)