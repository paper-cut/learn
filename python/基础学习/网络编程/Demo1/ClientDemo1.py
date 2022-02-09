import socket


clintsocket=socket.socket(socket.AF_INET,socket.SOCK_STREAM)

host=socket.gethostname()

port=12345

clintsocket.connect((host,port))

sendMsg="发送客户端数据"
clintsocket.send(sendMsg.encode("utf-8"))

getMsg=clintsocket.recv(1024)

clintsocket.close()

print(getMsg.decode("utf-8"))