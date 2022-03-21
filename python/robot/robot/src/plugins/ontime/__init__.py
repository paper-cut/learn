# import nonebot
from nonebot import get_driver
from nonebot import require
from .config import Config
from nonebot import get_bot
from nonebot_plugin_apscheduler import scheduler
from .data_source import gettheword
from nonebot.adapters.cqhttp import Bot
global_config = get_driver().config
config = Config(**global_config.dict())



@scheduler.scheduled_job("cron",hour="23",minute="00",id="soup")
async def begin():
    getword=gettheword()
    soup=getword.getsoup()
    await get_bot().call_api("send_private_msg",message=soup,user_id=2080706519)
    await get_bot().call_api("send_private_msg",message=soup,user_id=3065666745)
   

# Export something for other plugin
# export = nonebot.export()
# export.foo = "bar"

# @export.xxx
# def some_function():
#     pass
