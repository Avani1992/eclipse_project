import pytest
import  time

def test_screenshot(test_checkurl,test_common):
    time.sleep(1)
    test_common[0].save_screenshot("Acti.png")
    test_common[0].close()