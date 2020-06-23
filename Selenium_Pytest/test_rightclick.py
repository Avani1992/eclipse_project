import pytest
import time
from selenium.webdriver.common.action_chains import ActionChains

def test_rightclickCheck(test_checkurl,test_common):
        time.sleep(2)
        moveE=test_common[0].find_element_by_xpath("//a[contains(text(),'actiTIME Inc.')]") # location of right click.
        action=ActionChains(test_common[0])
        action.move_to_element(moveE).context_click().perform()  # right click
        time.sleep(2)
        test_common[0].close()