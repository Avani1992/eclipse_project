import pytest
import time
from selenium.webdriver.common.action_chains import ActionChains

def test_dropdownMenu(test_dropdown,test_common):
    moveE=test_common[0].find_element_by_xpath("//a[@class='c-link dropdown-toggle']")
    action=ActionChains(test_common[0])
    action.move_to_element(moveE).perform()
    time.sleep(2)
    test_common[0].find_element_by_xpath("//a[contains(text(),'MS Office Plug-ins')]").click()
    time.sleep(2)
    test_common[0].close()
    