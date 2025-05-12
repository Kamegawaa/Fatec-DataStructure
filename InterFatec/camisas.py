tecido_total = int(input('Total tecido: '))

qt_cam1 = int(input('qt tecido cam1: '))
lucro_cam1 = int(input('lucro cam1: '))

qt_cam2 = int(input('qt tecido cam2: '))
lucro_cam2 = int(input('lucro cam2: '))

qt_cam3 = int(input('qt tecido cam3: '))
lucro_cam3 = int(input('lucro cam3: '))

formula1 = lucro_cam1/qt_cam1 

formula2 = lucro_cam2/qt_cam2

formula3 = lucro_cam3/qt_cam3

lucro_total = 0
melhortecido = 0
maiorlucro = 0

if formula1 > formula2 and formula1 > formula3:
    melhortecido = qt_cam1
    maiorlucro = lucro_cam1
elif formula2 > formula1 and formula2 > formula3:
    melhorcaso = qt_cam2
    maiorlucro = lucro_cam2
else:
   melhorcaso = qt_cam3
   maiorlucro = lucro_cam3  

while tecido_total>=melhortecido:
    tecido_total=tecido_total-melhortecido
    lucro_total=lucro_total+maiorlucro

while tecido_total>=qt_cam1 or tecido_total>=qt_cam2 or tecido_total>=qt_cam3:
    if tecido_total>=qt_cam1:
        tecido_total=tecido_total-qt_cam1
        lucro_total=lucro_total+lucro_cam1
    elif tecido_total>=qt_cam2:
            tecido_total=tecido_total-qt_cam2
            lucro_total=lucro_total+lucro_cam2
    elif tecido_total>=qt_cam3:
        tecido_total=tecido_total-qt_cam3
        lucro_total=lucro_total+lucro_cam3

print(tecido_total,' || ',lucro_total)
