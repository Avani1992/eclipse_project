import pytest

import time

def test_cropImage(test_common,test_checkurl):
    time.sleep(2)
    logo=test_common[0].find_element_by_xpath("//div[@class='atLogoImg']")
    location=logo.location()
    size=logo.size()
    test_common[0].save_screenshot("FullPage.png")

    x=location['x']
    y=location['y']
    width=location['x']+size['width']
    height=location['y']+size['height']
    im=Image.open('FullPage.png')
    im=im.crop((int(x),int(y),int(width),int(height)))
    im.save('logo.png')
    test_common[0].close()