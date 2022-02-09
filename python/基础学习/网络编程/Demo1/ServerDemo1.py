import socket
import sys

serversocket=socket.socket(socket.AF_INET, socket.SOCK_STREAM)

host=socket.gethostname()

port=12345

serversocket.bind((host,port))

serversocket.listen(5)

while(True):
    sock,addr=serversocket.accept()

    print("addr为",str(addr),"的用户接入")

    msg="欢迎接入"+"\r\n"

    getmsg=sock.recv(1024)
    print("接受到数据",getmsg.decode("utf-8"))
    sock.send(msg.encode("utf-8"))
    sock.close()
