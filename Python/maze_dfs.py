import numpy as np
from matplotlib import pyplot as plt

def display(maze, a, b):
    img = np.zeros((*maze.shape, 3), dtype=np.uint8)
    img[maze == '0'] = 255
    img[maze == 'E'] = [0, 255, 0]
    img[maze == 'P'] = [255, 200, 210]
    img[a, b] = [255, 0, 0]
    plt.imshow(img)
    plt.axis('off')
    plt.pause(0.3)
    plt.cla()
    
def isConnect(a, b):
    i, j = a
    for n, m in zip([i - 1, i, i + 1, i], [j, j + 1, j, j - 1]):
        if m == b[1] and n == b[0]:
            return True
    return False

maze = np.array([list('11111111111111'),
                 list('10101000110001'),
                 list('1000S010000101'),
                 list('10101011101101'),
                 list('11001000010001'),
                 list('10011111010111'),
                 list('101000000100E1'),
                 list('11111111111111')])
S = maze.shape
start = np.where(maze == 'S')
stack = [[start[0][0], start[1][0]]]
path = []
while stack:
    py, px = stack.pop()
    if maze[py, px] == 'E':
        py, px = stack.pop()
        break
    for [a, b] in path[::-1]:
        if isConnect([py, px], [a, b]):
            break
        path.pop()
        if path: 
            display(maze, path[-1][0], path[-1][1])
    display(maze, py, px)
    maze[py, px] = 'P'
    path.append([py, px])
    for i, j in zip([py - 1, py, py + 1, py], [px, px + 1, px, px - 1]):
        if (maze[i, j] == 'E' or maze[i, j] == '0') and (i > -1 or i < S[0]) and (j > -1 or j < S[1]):
            stack.append([i, j])
plt.show