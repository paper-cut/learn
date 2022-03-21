# import nonebot
from nonebot import on_command
from nonebot.rule import to_me
from nonebot.typing import T_State
from nonebot.adapters import Bot,Event
from .data_source import getweather
from nonebot import get_driver

from .config import Config

global_config = get_driver().config
config = Config(**global_config.dict())

weather=on_command("天气",rule=to_me(),priority=1)

@weather.handle()
async def handle_first_weather(bot:Bot,event:Event,state:T_State):
    args=str(event.get_message()).strip()
    if args:
        state["city"]=args
@weather.got("city",prompt="你想查询哪个城市？")
async def handle_city(bot:Bot,event:Event,state:T_State):
    city=state["city"]
    city_weather=await get_weather(city)
    await weather.finish(city_weather)

async def get_weather(city):
    getweat=getweather()
    weather=getweat.get(city)
    now=weather[0]
    today=weather[1]
    tomorrow=weather[2]
    weather_str="城市："+city+"\n-------------"+"\n当前天气：\n天气："+now[0]+"\n温度："+now[1]+"\n风向："+now[2]+"\n风强："+now[3]+"\n-------------"+"\n今日天气："+"\n日期："+today[0]+"\n温度："+today[1]+"\n天气："+today[2]+"\n风向："+today[3]+"\n-------------"+"\n明日天气："+"\n日期："+tomorrow[0]+"\n温度："+tomorrow[1]+"\n天气："+tomorrow[2]+"\n风向："+tomorrow[3]
    return weather_str
# Export something for other plugin
# export = nonebot.export()
# export.foo = "bar"

# @export.xxx
# def some_function():
#     pass
