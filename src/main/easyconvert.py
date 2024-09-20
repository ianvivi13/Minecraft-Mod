import re

inputString = '''   AllDefaultOreRecipes(pRecipeOutput, ModBlocks.TITANIUM_ORE.get(), ModBlocks.DEEPSLATE_TITANIUM_ORE.get(), ModItems.RAW_TITANIUM.get(), ModItems.TITANIUM_INGOT.get(), 1.2F, ModBlocks.RAW_TITANIUM_BLOCK.get(), ModBlocks.TITANIUM_BLOCK.get());'''
wordToSearch = "TITANIUM"
replaceWith = ["TIN", "MAGNESIUM", "ZINC", "RUBY", "SAPPHIRE"]

for word in replaceWith:
    newString = inputString
    for i in range(0, inputString.lower().count(wordToSearch.lower())):
        newCaseWord = ""
        wordToSearchWithCase = re.search(wordToSearch, newString, flags=re.I).group(0)
        if wordToSearchWithCase[0].islower():
            newCaseWord = word.lower()
        else:
            if len(wordToSearchWithCase) > 1 and wordToSearchWithCase[1].islower():
                newCaseWord = word[0].upper() + word[1:].lower()
            else:
                newCaseWord = word.upper()
        newString = newString.replace(wordToSearchWithCase, newCaseWord, 1)
    print(newString)
print("\n")
