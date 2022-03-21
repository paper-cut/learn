import requests
import json

class gettheword:
    def __init__(self):
        pass
    def getjoke():
        url="https://v2.alapi.cn/api/joke"
        token="LwExDtUWhF3rH5ib"
        re=requests.get(url+"?token="+token)
    def getsoup(self):
        url="https://apis.juhe.cn/fapig/soup/query?key="
        key="91a2129e1c14aedd57948b232ec5fe8d"
        re=requests.get(url+key)
        rejson=json.loads(re.text)
        soup=rejson["result"]["text"]
        return soup
