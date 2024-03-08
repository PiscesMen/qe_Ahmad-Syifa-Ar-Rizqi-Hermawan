# Contoh PowerShell Script

# a.1 Command yang berhubungan dengan operasi file: Menampilkan isi direktori
Get-ChildItem

# a.2 Command yang berhubungan dengan operasi file: Membuat file teks baru
New-Item -Path . -Name "newfile.txt" -ItemType "file"

# b.1 Command yang berhubungan dengan kontrol proses: Mencari proses yang sedang berjalan
Get-Process

# b.2 Command yang berhubungan dengan kontrol proses: Menghentikan proses berdasarkan nama
# Stop-Process -Name "notepad" -Force

# c.1 Command yang berhubungan dengan utility: Melihat konfigurasi IP komputer
Get-NetIPConfiguration

# c.2 Command yang berhubungan dengan utility: Melakukan ping ke google.com untuk memeriksa konektivitas
Test-Connection -ComputerName google.com -Count 2
