# commands and scripts
    //Search working directory for all items (recursively) with a string value
Get-ChildItem . -Force -filter "example string" -Recurse | %{$_.fullname} | Out-GridView

	//Get all child path values from a working directory
Get-ChildItem . -Force -Recurse | %{$_.fullname} | Out-GridView

	//Output all the Path names on the computer (C:\) and print result to .txt file
Get-ChildItem . -Force -Recurse | %{$_.fullname} | Out-File -FilePath C:\Users\yourName\Documents\ -Append -encoding utf8

	//Search the .txt file the pwsh just created for a specific string
$folderPath = "C:\Users\yourName\documents*"
$pattern = "example string"
Get-ChildItem $folderPath -recurse | Select-String -pattern $pattern |
Select LineNumber, Line, Pattern, Matches | Out-GridView

This Search feature runs faster than the find feature in Notepad++

Java Program (on github) has 2 different ways to output search substring data