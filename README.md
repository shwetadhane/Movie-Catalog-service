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


**start the minikube instructions** 

minikube start driver--docker

env $(minikube docker-env)

**Do rollout of latest patch of any service running** 

stop the running port forwarding, which was started as **kubectl port-forward deployment/movie-catalog-deployment 9091:9091** 

then issue a command **kubectl rollout restart deployment/movie-catalog-deployment**

Then start the port forwarding by **kubectl port-forward deployment/movie-catalog-deployment 9091:9091**

By this two command you can run latest image of service in Kubernetes.

You can moniter the latest progress of the same by **kubectl get pods** command, you will get to see the pods are getting deleted and recreated.


**Please do this carefully while doing cleanup of the Minikube cluster** 

kubectl delete deployments --all                           
kubectl delete services --all
kubectl delete pods --all
kubectl delete daemonset --all
