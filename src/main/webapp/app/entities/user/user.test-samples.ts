import { IUser } from './user.model';

export const sampleWithRequiredData: IUser = {
  id: 9363,
  login: 'L4Oc',
};

export const sampleWithPartialData: IUser = {
  id: 29452,
  login: 'Et@MJCJp\\}IIHBHI\\rMzr\\tu\\nhj-Jm\\q2OWC',
};

export const sampleWithFullData: IUser = {
  id: 19385,
  login: 'eO6o',
};
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
