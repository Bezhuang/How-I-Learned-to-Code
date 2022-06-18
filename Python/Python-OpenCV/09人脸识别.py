import cv2 as cv
import numpy as np
import os

# 加载训练数据集文件
recognizer = cv.face.LBPHFaceRecognizer_create()
recognizer.read('trainer/trainer.yml')
# 准备识别的图片
faceCascade = cv.CascadeClassifier(
    'opencv/sources/data/haarcascades/haarcascade_frontalface_default.xml')
font = cv.FONT_HERSHEY_SIMPLEX
id = 0
img = cv.imread('19.pgm')
gray_img=cv.cvtColor(img,cv.COLOR_BGR2GRAY)
faces = faceCascade.detectMultiScale(gray_img)
for x, y, w, h in faces:
    cv.rectangle(img, (x, y), (x + w, y + h), (0, 255, 0), 2)
    # 人脸识别
    id, confidence = recognizer.predict(gray_img[y:y + h, x:x + w])
    print('标签id:', id, '置信评分：', confidence)
cv.imshow('result', img)
cv.waitKey(0)
cv.destroyAllWindows()
