**To setup required underline database** 

**run the command** : 
docker compose up -d

Then execute 
docker compose ps

**This will setup:**
postgres database
Postgresql query tool PGAdmin
Zipkin
RaabitMQ


**Installinng Kubernetes cluster on Windows**

PS C:\Users\Admin> Set-ExecutionPolicy Bypass -Scope Process -Force; [System.Net.ServicePointManager]::SecurityProtocol = [System.Net.ServicePointManager]::SecurityProtocol -bor 3072; iex ((New-Object System.Net.WebClient).DownloadString('https://community.chocolatey.org/install.ps1'))

choco

choco -?

PS C:\Users\Admin> choco install kubernetes-cli

PS C:\Users\Admin> choco install minikube

PS C:\Users\Admin> systeminfo 

PS C:\Users\Admin> minikube start

** KUBCTL Commands ********

PS C:\Users\Admin> kubectl run hello-app-6 --image=pradnyilk/demo-app:latest --port=9091 --image-pull-policy=Always

** Get list of Pods running **
kubectl get pods

** Delete Any Specific Pod ***
PS C:\Users\Admin> kubectl delete pod hello-app-4


