#k_means using iris dataset

#importing
import pandas as pd
import matplotlib.pyplot as plt
from sklearn.cluster import KMeans
from sklearn.preprocessing import StandardScaler
from sklearn.metrics import silhouette_score

#loading
df=pd.read_csv('iris.csv')
print(df)
X=df.drop('variety',axis=1)


#feature Scaling
scaler=StandardScaler()
iris_scaled=scaler.fit_transform(X)


#kmeans fitting
kmeans=KMeans(n_clusters=4)
kmeans.fit(X)

# Evaluate the clustering performance using silhouette score
silhouette_score = silhouette_score(X, kmeans.labels_)
print(f"Silhouette Score: {silhouette_score:.2f}")

# Alternatively, you can use inertia (within-cluster sum of squares)
inertia = kmeans.inertia_
print(f"Inertia: {inertia:.2f}")

centroids = kmeans.cluster_centers_

print("Centroids:")
print(centroids)

print("Labelling:")
print(kmeans.labels_)

'''The Silhouette Score is a metric that aids in the assessment of clustering performance.
Evaluating the quality of clustering is essential to determine the effectiveness and reliability of clustering algorithms.
Since clustering is an unsupervised learning task, there are no clear labels to validate the clusters.
Therefore, evaluating the clustering results requires the use of internal validation metrics like the Silhouette Score.'''

'''The Silhouette Score quantifies how well a data point fits into its assigned cluster and how distinct it is from other clusters.
It measures the cohesion and separation of data points within clusters and helps determine whether the clusters are well-separated and internally homogeneous.
'''
